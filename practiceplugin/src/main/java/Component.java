package {{fullName}};
import com.billy.cc.core.component.CC;
import com.billy.cc.core.component.IComponent;

/**
 * 组件之间通信
 */
public class Component implements IComponent {

    @Override
    public String getName() {
        return "{{pluginName}}";
    }

    @Override
    public boolean onCall(CC cc) {
        String actionName = cc.getActionName();
        switch (actionName) {
           //Todo 请在这里实现相应的通信
        }
        return false;
    }


}
