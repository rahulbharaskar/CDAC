
/*

/*12. Write a program to draw the following pattern:

*****
*****
*****
*****
*****
*/
/*
public class Pattern1{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
/*__________________________________
13. Write a program to print the following pattern:

1
2*2
3*3*3
4*4*4*4
5*5*5*5*5
5*5*5*5*5
4*4*4*4
3*3*3
2*2
1
*/
/*
public class Pattern2{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}*/
/*________________________________________
14. Write a program to print the following pattern:

*
**
***
*****
*******
*********
*/
/*
//import java.util.Scanner;
public class Demo1{
       public static void main(String args[]){

                 int n = 9;/*;
                  System.out.println("Enter a number");                
                  Scanner scanner = new Scanner(System.in);  
                  n = scanner.nextInt(); */
                  /*
                  for(int i=1;i<=n;i++){
                           if(i%2==0&&i>2){
                                    continue;
                           }
                           for(int j=1;j<=i;j++){
                                 System.out.print("*");
                            }
                            System.out.println();
              }

     }
}
}*/
/*________________________________________
15. Write a program to print the following pattern:
  *
 **
***
****
*****
*/
/*
public class Pattern4{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*________________________________________
16. Write a program to print the following pattern:
*
***
*****
*******
*********
*/
/*
public class Pattern5{
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i += 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*________________________________________
17. Write a program to print the following pattern:

*****
****
***
**
*
*/
/*
public class Pattern6{
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
________________________________________
18. Write a program to print the following pattern:
markdown
Copy code
*
***
*****
*******
*****
***
*

*/
/*
public class Pattern7{
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i += 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i -= 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*________________________________________
19. Write a program to print the following pattern:

1
1*2
1*2*3
1*2*3*4
1*2*3*4*5

*/
/*
public class Pattern8{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
/*_______________________________________
20. Write a program to print the following pattern:

5
5*4
5*4*3
5*4*3*2
5*4*3*2*1

*/
/*
public class Pattern9{
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
                if (j > i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
/*________________________________________
21. Write a program to print the following pattern:

1
1*3
1*3*5
1*3*5*7
1*3*5*7*9

*/
/*
public class Pattern10{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num += 2;
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
/*________________________________________
22. Write a program to print the following pattern:

*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********
*********
*/

public class StarPattern {
    public static void main(String[] args) {
        int n = 5; // Maximum width of the pattern (at the center)
        
        // First part: Upper pyramid
        for (int i = n; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Second part: Lower inverted pyramid
        for (int i = 2; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*________________________________________
23. Write a program to print the following pattern:

11111
22222
33333
44444
55555

*/
/*
public class Pattern12{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
/*________________________________________
24. Write a program to print the following pattern:

1
22
333
4444
55555

*/
/*
public class Pattern13{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
/*_______________________________________
25. Write a program to print the following pattern:

1
12
123
1234
12345
/*
public class Pattern14{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
/*________________________________________
26. Write a program to print the following pattern:

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/
/*
public class Pattern15{
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}



*/