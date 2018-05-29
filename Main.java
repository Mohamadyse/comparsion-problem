package sigma.se;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String files[];
        int collisions = 0;
        int unique = 0;


        int n = sc.nextInt();
        sc.nextLine();
        while (n != 0) {
            files = new String[n];
            String currentFile;
            for (int i = 0; i <= n - 1; i++) {

                //    files[i] = sc.nextLine();


                currentFile = sc.nextLine();

                if (i == 0) {
                    unique = 1;
                    files[0] = currentFile;
                } else // i>0
                {
                    int j = 0;
                    //comparing the current file with all elemnts of the arry of unique files
                    while (j < files.length) {
                        //     for (int j = 0; j < unique ; j++)
                        if (files[j].equals(currentFile)) {
                            collisions ++;
                            break;
                        } else {
                            if (j == unique - 1) // we are at the last element of the unique array
                            {
                                files[unique] = currentFile;
                                unique++;
                                break;
                            } else j++;
                        }

                    }


                }

            }
            System.out.print("\n" + unique + " " + collisions);

            n = sc.nextInt();
            sc.nextLine();

        }


    }
}
