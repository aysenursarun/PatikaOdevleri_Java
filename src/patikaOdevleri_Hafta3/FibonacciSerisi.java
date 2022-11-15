package patikaOdevleri_Hafta3;

import java.util.Scanner;

public class FibonacciSerisi {

    /* odev: Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.

 Fibonacci Serisi Nedir ?
 Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
 Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar,
 yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.
 Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır.
 Elde edilen sonuç rakamın sağ tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:
 9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34 */

        public static void main(String[] args) {
                int x = 0,y=1,z,t;


                Scanner scan = new Scanner(System.in);
                System.out.print("Fibonacci sersinin eleman sayisini yaziniz: ");
                t = scan.nextInt();
                System.out.print(x+", "+y);

                for (int i = 2; i <= t; i++) {
                        z = x+y;
                        System.out.print(", "+z);
                        x = y;
                        y = z;
                        System.out.print(" ");
                }
        }
        }











