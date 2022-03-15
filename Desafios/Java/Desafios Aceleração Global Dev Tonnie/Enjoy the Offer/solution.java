// Exchanging Cards

/*

Alice and Betty collect Pok´mon cards. The cards are printed for a game that imitates the battle system of one of the most popular videogames in history, but Alice and Betty are too young to actually play the game, and are only interested in the actual cards. To make it easier, we'll assume each card has a unique identifier, given as an integer number.
Both girls have a set of cards, and, like most girls their age, like to trade the cards they have. They obviously don't care about identical cards they both have, and they don't want to receive repeated cards in the trade. Besides, the cards are traded in a single operation: Alice gives Betty N distinct cards and receives back other N distinct cards.
The girls want to know what is the maximum number of cards they can trade. For instance, if Alice has cards {1, 1, 2, 3, 5, 7, 8, 8, 9, 15} and Betty has cards {2, 2, 2, 3, 4, 6, 10, 11, 11}, they can trade at most four cards.
Write a program that given the sets of cards owned by Alice and Betty, determines the maximum number of cards they can trade.
Input
The input contains several test cases. The first line of a test case contains two integers A and B, separated by a blank space, indicating respectively the number of cards Alice and Betty have (1 ≤ A ≤ 104 and 1 ≤ B ≤ 104). The second line contains A space-separated integers Xi, each indicating one of Alice\'s cards(1 ≤ Xi ≤ 105). The third line contains B integers Yi separated by whitespaces, each number indicating one of Betty's cards(1 ≤ Yi ≤ 105). Alice and Betty's cards are listed in non-descending order.
The end of input is indicated by a line containing only two zeros, separated by a blank space.
Output
For each test case, your program should print a single line, containing an integer number, indicating the maximum number of cards Alice and Betty can trade.
 
Sample Input	
1 1
1000
1000
3 4
1 3 5
2 4 6 8
10 9
1 1 2 3 5 7 8 8 9 15
2 2 2 3 4 6 10 11 11
0 0	
Sample Output
0
3
4


*/

import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;
import java.io.StreamTokenizer;
import java.util.HashSet;
import java.util.Iterator;


public class ExchangingCards {
    private static final boolean DEBUG = false;
    private BufferedReader cin;
    private PrintWriter cout;
    private StreamTokenizer tokenizer;
    private HashSet<Integer> s1, s2;
    private int a, b;

    public void init()
    {
        try {
            if (DEBUG) {
                cin = new BufferedReader(new InputStreamReader(
                        new FileInputStream("e:\\uva_in.txt")));
            } else {
                cin = new BufferedReader(new InputStreamReader(System.in));
            }

            tokenizer = new StreamTokenizer(cin);

            cout = new PrintWriter(new OutputStreamWriter(System.out));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String next()
    {
        try {
            tokenizer.nextToken();
            if (tokenizer.ttype == StreamTokenizer.TT_EOF) return null;
            else if (tokenizer.ttype == StreamTokenizer.TT_NUMBER) {
                return String.valueOf((int)tokenizer.nval);
            } else return tokenizer.sval;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean input()
    {
        a = Integer.parseInt(next());
        b = Integer.parseInt(next());

        if (a == 0 && b == 0) return false;

        s1 = new HashSet<Integer>();
        s2 = new HashSet<Integer>();

        for (int i = 0; i < a; i++) {
            s1.add(Integer.parseInt(next()));
        }

        for (int i = 0; i < b; i++) {
            s2.add(Integer.parseInt(next()));
        }
        return true;
    }

    public void solve()
    {
        int ans = s1.size();
        Iterator<Integer> it = s2.iterator();

        int cnt = 0;
        while (it.hasNext()) {
            int num = it.next();
            if (!s1.contains(num)) cnt++;
            else ans--;
        }

        ans = Math.min(ans, cnt);
        cout.println(ans);
        cout.flush();
    }

    public static void main(String[] args)
    {
        ExchangingCards solver = new ExchangingCards();
        solver.init();

        while (solver.input()) {
            solver.solve();
        }
    }
}



