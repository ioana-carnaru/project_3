package GUI.SignUpWindow;

import GUI.AbstractClasses.Buttons;
import GUI.signInWindow.SignInFrame;

import java.awt.event.ActionEvent;

public class SubmitSignUpButton extends Buttons {
    private boolean _hasInput=false;
    private boolean _wantsToSignUp=false;
    String _user;
    String _password;
    public SubmitSignUpButton (String text) {
        super(text);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this._password=String.copyValueOf(SignInFrame.getFrame().getPasswordField().getPassword());
        this._user=SignInFrame.getFrame().getUsernameField().getText();
        this._hasInput=true;
        this._wantsToSignUp=true;
        System.out.println("Am apasat butonul de sign up");
    }
    public String getPassword()
    {
        return this._password;
    }
    public String getUser()
    {
        return this._user;
    }
    public boolean getHasInputForSignUp()
    {
        return this._hasInput;
    }
    public void set_hasInput(boolean hasInput)
    {
        this._hasInput=hasInput;
    }
    public boolean is_wantsToSignUp()
    {
        return this._wantsToSignUp;
    }
    public void set_wantsToSignUp(boolean wantsToSignUp)
    {
        this._wantsToSignUp=wantsToSignUp;
    }
}
