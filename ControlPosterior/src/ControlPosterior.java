// ControlPosterior.java Iteración (do-While)
public class ControlPosterior
{
    public static void main(String args [])
    {
        int num;
        do
        {
            num = (int) (Math.random() * 10);
        }
        while ((num>2) && (num < 8));
        System.out.println("num vale:" + num);
        }
    }