package com.example.listpractice.di;

import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import java.util.concurrent.atomic.AtomicBoolean;

import timber.log.Timber;

/**
 * 생명 주기에 안전하게 이벤트 처리
 */
public class SingleLiveEvent<T> extends MutableLiveData<T> {
    private final AtomicBoolean mPending = new AtomicBoolean(false);

    @MainThread
    public void observe(LifecycleOwner owner, final Observer<? super T> observer){
        if (hasActiveObservers()){
            Timber.w("여러 observer가 존재하지만, 단 하나만 알림받을 수 있다.");
        }

        super.observe(owner, t -> {
            if(mPending.compareAndSet(true,false)){
                observer.onChanged(t);
            }
        });
    }
    @MainThread
    public void setValue(@Nullable T t){
        mPending.set(true);
        super.setValue(t);
    }

    @MainThread
    public void call(){
        setValue(null);
    }
}
