public class ControlStatements {
    public static void main(String[] args) {

        float studentGrade= 90;

       // if ( studentGrade >= 95 )
        //     System.out.println( "Passed" );


        //if-else
        /*
        if ( studentGrade >= 60 )
            System.out.println( "Passed" );
        else
            System.out.println( "Failed" );

*/
        /*
        //ladder if
        if ( studentGrade >= 90 )
            System.out.println( "A" );
        else if ( studentGrade >= 80 )
            System.out.println( "B" );
        else if ( studentGrade >= 70 )
            System.out.println( "C" );
        else if ( studentGrade >= 60 )
            System.out.println( "D" );
        else
            System.out.println( "F" );
*/
/*
        int x=60;
        int y=70;
        if ( x > 50 )
            if ( y > 50 )
                System.out.println( "x and y are > 50" );
            else
                System.out.println( "x is <= 50" );
*/
/*
        int sayac = 1; // declare and initialize control variable
        while ( sayac <= 10 ) // loop-continuation condition
        {
            System.out.printf( "While: %d %n", sayac);
            ++sayac; // increment control variable by 1
        } // end while
        System.out.printf( "whıle dısı: %d %n", sayac);



/*
        int sayac1 = -2;
        do {
            // code block to be executed
            System.out.printf( "DO WHİLE block print:%d %n", sayac1);
            sayac1++;
        }
        while (sayac1 <=0);

        // for döngüsü
/*

for ( initialization; loopContinuationCondition; increment )
        statement
i control variable

*/
/*
        for (int i = 0; i < 5; i++) {
            System.out.printf("FOR- i degeri: %d%n",i);
        }
*/


/*
        switch(expression) {
            case x:
                // code block
                break;
            case y:
                // code block
                break;
            default:
                // code block
        }

 */
/*
        int sayi=sayac;
        switch (sayi){
            case 10:
                System.out.println("swich-case:10");
                break;
            case 11:
                System.out.println("swich-case:11");
                break;
            case 12:
                System.out.println("swich-case:12");
                break;
            default:
                System.out.println("out of scope");


                      }
*/


 //break
        int i = 0;
        while (i < 10) {
            System.out.println("breakkk"+i);
            i++;
            if (i == 4) {
                break;  // döngü dışına çıkma

            }
        }

/*
 */

// continue
        int k = 0;
        while (k < 10) {
            if (k == 4) {
                k++;
                continue;
                //The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
            }
            System.out.println("cont"+k);
            k++;
        }






    }

}

/*
for each
    // create an array
    int[] numbers = {3, 9, 5, -5};

    // for each loop
    for (int number: numbers) {
      System.out.println(number);
    }
 */