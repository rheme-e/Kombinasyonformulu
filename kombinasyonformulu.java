package Giris;

import java.util.Scanner;

public class kombinasyonformulu {
    public static void main(String[] args) {
        int n,k,r,nfak=1,rfak=1,nrfak=1;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayı değeri giriniz(n):");
        n=inp.nextInt();
        System.out.print("Sayı değeri giriniz(r):");
        r=inp.nextInt();
        for(k=1; k<=n; k++){
            nfak*=k;

        }for(k=1; k<=r; k++){
            rfak*=k;

        }if (n>r){
            for(k=1; k<=(n-r); k++){
                nrfak*=k;
            }
        }else {
            for(k=1; k<=(r-n); k++){
                nrfak*=k;
        }
} System.out.println("C(n,r)="+ nfak/(rfak*nrfak));
}
}