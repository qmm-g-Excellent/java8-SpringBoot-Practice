package com.observeral;

import java.util.Observer;

/**
 * Created by qmm on 17-7-25.
 */

//subject主题接口
//public interface Subject {
//
//    //增加一个观察者
//    public void registerObserver(Observer observer);
//
//
//
//    //删除一个观察者，—我不想让你看了
//    public void removeObserver(Observer observer);
//
//
//    //既然要观察，我发生改变了他也应该用所动作—通知观察者
//    public void notifyAllObservers(String context);
//}


public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyAllObservers();
}
