package Lec04;
// Generic class with method overloading
public class GenericMultiArrays<T, S>{
    T a[];
    S b[];

    GenericMultiArrays(T x, S y){
        a=x;
        b=y;
    }

    T getData(int i){
        return a[i];
    }
    S getData(int i){
        return b[i];
    }

    void printData(T, t){
        for(int i=0; i<t.length(); i++)
            System.out.println(t.getData(i)+ "---");
            System.out.println();
        
    }
    void printData(S, s){
        for(int i=0; i<t.length(); i++)
            s[i].printStudent();
            System.out.println();
        
    }

    void reverseArray(T, t){
        int front=0, rear = t.length-1; T temp;
        while(front<rear){
            temp = t[rear];
            t[rear] = t[front];
            t[front] = temp;
            front++; rear--;
        }
    }
    void reverseArray(S, s){
        int front=0, rear = t.length-1; T temp;
        while(front<rear){
            temp = t[rear];
            t[rear] = t[front];
            t[front] = temp;
            front++; rear--;
        }
    }

}