package edu.cerp.checkin.ui;

import edu.cerp.checkin.logic.SesionService;
import edu.cerp.checkin.model.Inscripcion;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class CheckInGUI {

    public static void show(SesionService service) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("📋 Check-in Aula");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(700, 400);
            frame.setLocationRelativeTo(null); // centrar en pantalla

            // ---------- Panel superior: título ----------
            JLabel titulo = new JLabel("Registro de Inscripciones", SwingConstants.CENTER);
            titulo.setFont(new Font("SansSerif", Font.BOLD, 18));
            titulo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            frame.add(titulo, BorderLayout.NORTH);

            // ---------- Panel izquierdo: formulario ----------
            JPanel formPanel = new JPanel(new GridLayout(4, 2, 8, 8));
            formPanel.setBorder(BorderFactory.createTitledBorder("Nueva inscripción"));

            JTextField txtNombre = new JTextField();
            JTextField txtDocumento = new JTextField();
            JComboBox<String> cmbCurso = new JComboBox<>(new String[]{"Prog 1", "Prog 2", "Base de Datos"});
            JButton btnRegistrar = new JButton("Registrar");
            JButton btnResumen = new JButton("Resumen");

            formPanel.add(new JLabel("Nombre:"));
            formPanel.add(txtNombre);
            formPanel.add(new JLabel("Documento:"));
            formPanel.add(txtDocumento);
            formPanel.add(new JLabel("Curso:"));
            formPanel.add(cmbCurso);
            formPanel.add(btnRegistrar);
            formPanel.add(btnResumen);

            // ---------- Panel derecho: tabla de inscripciones ----------
            String[] columnas = {"Nombre", "Documento", "Curso", "Hora"};
            DefaultTableModel tableModel = new DefaultTableModel(columnas, 0);
            JTable tabla = new JTable(tableModel);
            JScrollPane scroll = new JScrollPane(tabla);
            scroll.setBorder(BorderFactory.createTitledBorder("Inscripciones"));

            // ---------- Acción Registrar ----------
            btnRegistrar.addActionListener(e -> {
                String nombre = txtNombre.getText();
                String doc = txtDocumento.getText();
                String curso = (String) cmbCurso.getSelectedItem();
                service.registrar(nombre, doc, curso);

                actualizarTabla(service, tableModel);

                txtNombre.setText("");
                txtDocumento.setText("");
            });

            // ---------- Acción Resumen ----------
            btnResumen.addActionListener(e ->
                    JOptionPane.showMessageDialog(frame,
                            service.resumen(),
                            "Resumen por curso",
                            JOptionPane.INFORMATION_MESSAGE));

            // ---------- Distribución principal ----------
            JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, formPanel, scroll);
            splitPane.setResizeWeight(0.3);
            frame.add(splitPane, BorderLayout.CENTER);

            // ---------- Cargar inscripciones iniciales ----------
            actualizarTabla(service, tableModel);

            frame.setVisible(true);
        });
    }

    private static void actualizarTabla(SesionService service, DefaultTableModel model) {
        model.setRowCount(0); // limpiar
        List<Inscripcion> inscripciones = service.listar();
        for (Inscripcion i : inscripciones) {
            model.addRow(new Object[]{
                    i.getNombre(),
                    i.getDocumento(),
                    i.getCurso(),
                    i.getFechaHora()
            });
        }
    }
}
