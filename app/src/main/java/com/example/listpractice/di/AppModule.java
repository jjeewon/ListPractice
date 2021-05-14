package com.example.listpractice.di;

import android.app.Application;
import android.content.Context;

import com.example.listpractice.App;
import com.example.listpractice.util.SingleLiveEvent;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module(includes = ViewModelModule.class)
public class AppModule {

    @Provides
    @Singleton
    Application provideApp(App app) {
        return app;
    }

    @Provides
    @Singleton
    @ApplicationContext
    Context provideContext(App app) {
        return app;
    }

    //앱의 오류 이벤트를 처리하는 SingleLiveEvent
    @Singleton
    @Provides
    @Named("errorEvent")
    SingleLiveEvent<Throwable> provideErrorEvent(){
        return new SingleLiveEvent<>();
    }

 

}