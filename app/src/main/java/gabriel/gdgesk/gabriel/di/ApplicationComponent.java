package gabriel.gdgesk.gabriel.di;

import javax.inject.Singleton;

import dagger.Component;
import gabriel.gdgesk.gabriel.GabrielApp;
import gabriel.gdgesk.gabriel.activity.MainActivity;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(GabrielApp gabrielApp);

    void inject(MainActivity activity);
}