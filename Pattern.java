public class Pattern {
    public static void main(String[] args) {
//    solid rectangle
for(int i=1;i<=4;i++){
        for(int j=1;j<=5;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
//hollow rectangle
for(int i=1;i<=4;i++){
        for(int j=1;j<=5;j++){
            if(i==1 || i==4 || j==1 || j==5){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
//pyramid
for (int i=1;i<=4;i++) {
    for(int j=1;j<=i;j++){
        System.out.print("* ");
    }
    System.out.println();
}

for (int i=4;i>=1;i--) {
    for(int j=1;j<=i;j++){
        System.out.print("* ");
    }
    System.out.println();
}

//inverted pyramid
int n=4;
for(int i=1;i<=n;i++){
 for(int j=1;j<=n-i;j++){
     System.out.print(" ");
 } 
 for(int j=1;j<=i;j++){
     System.out.print("*");
 }
    System.out.println();
}
//number pattern
for(int i=1;i<=5;i++){
    for(int j=1;j<=i;j++){
        System.out.print(j);
    }
    System.out.println();
}
for(int i=5;i>=1;i--){
    for(int j=1;j<=i;j++){
        System.out.print(j);
    }
    System.out.println();
}
    }}

        

}}
