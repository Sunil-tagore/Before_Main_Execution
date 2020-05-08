public class StaticBlockTime
{
static//which means we can give a quick important message before we execute a main function
    {
        System.out.println("Welcome to Big bazaar");
    }
    public static void main(String[] args)//we can even call another block like static block before main
    {
        try
        {
            int i=5/0;
            System.out.println("Your input leads to arthimetic Exception"+i);
         }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("check your input");
        }
        finally
        {
            System.out.println("better luck next time");
        }
      }
    }
