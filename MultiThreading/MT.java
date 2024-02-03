package MultiThreading;

class MT extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ignored)
            {

            }
        }
    }

    public static void main(String[] args) throws Exception
    {
        MT m1=new MT();
//        m1.start();

        Thread t1=new Thread(m1);
        m1.start();
        t1.start();

    }
}
