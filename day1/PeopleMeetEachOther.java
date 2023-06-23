package day1;

import java.util.Scanner;

class PeopleMeetEachOther {

    public boolean isMeet(int p1, int p2, int s1, int s2) {
        if (p1 < p2 && s1 <= s2) {
            return false;
        }
        if (p1 > p2 && s1 >= s2) {
            return false;
        }

        while(p1>=p2) {
            if(p1==p2) {
                return true;
            }
            p1+=s1;
            p2+=s2;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p1 = in.nextInt();
        int s1 = in.nextInt();
        int p2 = in.nextInt();
        int s2 = in.nextInt();
        in.close();
        boolean ans = new PeopleMeetEachOther().isMeet(p1, p2, s1, s2);
        System.out.println(ans ? "They met" : "They didnt met");
    }
}