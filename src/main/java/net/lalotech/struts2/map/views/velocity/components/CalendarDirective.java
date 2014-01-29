/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.map.views.velocity.components;

import com.opensymphony.xwork2.util.ValueStack;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.lalotech.struts2.map.components.Calendar;
import org.apache.struts2.components.Component;

/**
 *
 * @author Windows7x64
 */
public class CalendarDirective extends LalotechAbstractDirective{

    @Override
    public String getBeanName() {
        return "calendar";
    }

    @Override
    protected Component getBean(ValueStack stack, HttpServletRequest req, HttpServletResponse res) {
        return new Calendar(stack, req, res);
    }
    
}
