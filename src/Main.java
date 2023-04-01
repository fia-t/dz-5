public class Main {
    public static void main(String[] args) {
        int a=15, b=25, c=30, d=4;

        //Сумує попарно
        int sum1=a+b;
        int sum2=c+d;
        //Виводить результат порівняння сум
        System.out.println(sum1>sum2);

        sum1+=1;
        sum2-=2;
        //Виводить результат порівняння змінених сум
        System.out.println(sum1>sum2);
        //Виводить true, якщо хоча б одна змінена сума кратна 2
        System.out.println(sum1%2==0 || sum2%2==0);

    }
}