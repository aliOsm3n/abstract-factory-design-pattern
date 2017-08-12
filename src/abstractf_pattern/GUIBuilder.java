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
public class GUIBuilder {
    public void buildWindow(AbstractWidgetFactory widgetFactory){
    Window window = widgetFactory.createWindow();
    window.setTitle("New Window");
  }
    
}
