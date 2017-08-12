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
//ConcreteFactory1
public class MsWindowsWidgetFactory {
    
    //create an MSWindow
  public Window createWindow(){
    MSWindow window = new MSWindow();
    return window;
  }
    
}
