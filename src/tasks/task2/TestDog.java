package tasks.task2;

import java.util.Scanner;

public class TestDog
{
    public TestDog(int n)
    {
        A = new Dog[n];
        String N;
        Scanner StringIn = new Scanner(System.in);
        Scanner intIn = new Scanner(System.in);
        int a;
        for (int i = 0; i < n; i++)
        {
            N = StringIn.nextLine();
            a = intIn.nextInt();
            A[i] = new Dog(N, a);
        }
    }

    public Dog[] A;
}
