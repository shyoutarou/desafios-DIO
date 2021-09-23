using System; 

class Desafio {

        public static void Main()
        {

            int tc, x;
            tc = int.Parse(Console.ReadLine());
            for (int  i = 0; i < tc; i++)
            {
                x = int.Parse(Console.ReadLine());
                if (x == 0)
                {
                    Console.WriteLine("NULL");
                }
                else if (x % 2 == 0)
                {
                    if (x > 0)
                    {
                        Console.WriteLine("EVEN POSITIVE");
                    }
                    else
                    {
                        Console.WriteLine("EVEN NEGATIVE");
                    }

                }
                else
                {
                    if (x > 0)
                    {
                        Console.WriteLine("ODD POSITIVE");
                    }
                    else
                    {
                        Console.WriteLine("ODD NEGATIVE");
                    }
                }

            }

            Console.ReadLine();
        }

}