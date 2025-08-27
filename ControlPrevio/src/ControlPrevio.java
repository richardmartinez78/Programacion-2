// ControlPrevio.java Iteraci{on con control previo (while)
public class ControlPrevio
{
    public static void main(String args[])
    {
        double x, y =0;
        while (y < 20) {
            x = Math.random();
            y = y + x;
        }
        System.out.println(y);
        }
    }