package GUI.signInWindow;

import GUI.AbstractClasses.Buttons;

import java.awt.event.ActionEvent;

public class SubmitSignInButton extends Buttons {
    private boolean _hasInput=false;
    private boolean _wantsToSignIn=false;
    String _user;
    String _password;
    public SubmitSignInButton (String text) {
        super(text);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this._password=String.copyValueOf(SignInFrame.getFrame().getPasswordField().getPassword());
        this._user=SignInFrame.getFrame().getUsernameField().getText();
        this._hasInput=true;
        this._wantsToSignIn=true;
        System.out.println("Am apasat butonul de sign in");
    }
    public String getPassword()
    {
        return this._password;
    }
    public String getUser()
    {
        return this._user;
    }
    public boolean getHasInput()
    {
        return this._hasInput;
    }
    public void set_hasInput(boolean hasInput)
    {
        this._hasInput=hasInput;
    }
    public boolean is_wantsToSignIn()
    {
        return this._wantsToSignIn;
    }
    public void set_wantsToSignIn(boolean wantsToSignIn)
    {
        this._wantsToSignIn=wantsToSignIn;
    }
}
