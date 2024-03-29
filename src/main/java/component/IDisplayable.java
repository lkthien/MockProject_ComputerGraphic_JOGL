package component;

import com.jogamp.opengl.GL2;

public interface IDisplayable {
    public void Display(GL2 gl2);
    public void Init(GL2 gl2);
    public void Dispose();
}
