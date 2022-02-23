package basic;

/**
 * @author max
 * 双重校验锁生成单例
 */
public class Singleton {
    private  static Singleton singleton;

    private Singleton(){
        System.out.println("singleton is loaded");
    }

    public static Singleton getInstance(){
        if(singleton==null){
            synchronized (Singleton.class){
                if (singleton==null){
                    singleton=new Singleton();
                }
            }
        }
        return singleton;
    }
}
class Main{
    public static void main(String[] args){
        System.out.println("before");
        Singleton instance = Singleton.getInstance();
        System.out.println("after");
    }
}

