/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abstractf_pattern;

/**
 *
 * @author Ali Othman
 */
//ConcreteFactory2
public class MacOSXWidgetFactory implements  AbstractWidgetFactory{

    
    //create a MacOSXWindow
    @Override
    public Window createWindow() {
 MacOSXWindow window = new MacOSXWindow();
    return window;    }
    
}
