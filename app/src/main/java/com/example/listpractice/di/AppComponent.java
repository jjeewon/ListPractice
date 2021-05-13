package com.example.listpractice.di;

import com.example.listpractice.App;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {AndroidSupportInjectionModule.class, // dagger.android 사용을 위한 설정
                        ActivityModule.class, // 액티비티 스코프 모듈
                        AppModule.class // 애플리케이션 스코프 모듈
})

public interface AppComponent extends AndroidInjector<App> {
    // Android Application Component 정의
    @Component.Factory
    abstract class Factory implements AndroidInjector.Factory<App>{

    }
}
