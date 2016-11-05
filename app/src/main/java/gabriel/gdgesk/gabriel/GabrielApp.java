package gabriel.gdgesk.gabriel;

import android.app.Application;

import gabriel.gdgesk.gabriel.di.ApplicationComponent;
import gabriel.gdgesk.gabriel.di.ApplicationModule;
import gabriel.gdgesk.gabriel.di.DaggerApplicationComponent;

public class GabrielApp extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();
    }

    public ApplicationComponent getComponent() {
        return applicationComponent;
    }
}
