
package pkg100days;

public class Days099 {
static boolean cekPrima(int x) {
    if (x <= 1) return false;
    for (int i = 2; i <= x / 2; i++) {
        if (x % i == 0) return false;
    }
    return true;
}

public static void main(String[] args) {
    int n = 50;
    System.out.print("Bilangan Prima: ");

    for (int i = 1; i <= n; i++) {
        if (cekPrima(i)) {
            System.out.print(i + " ");
        }
    }
}
    
}
