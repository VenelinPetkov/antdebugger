package com.handyedit.ant.xdebug.vars;

import com.handyedit.ant.util.StringUtil;
import com.intellij.icons.AllIcons;
import com.intellij.xdebugger.frame.XValue;
import com.intellij.xdebugger.frame.XValueNode;
import org.jetbrains.annotations.NotNull;

/**
 * Variable renderer for the variables section (execution stack on the debugger tool window).
 *
 * @author Alexei Orischenko
 *         Date: Nov 11, 2009
 */
public class AntVar extends XValue {

    private String myName;
    private String myValue;

    public AntVar(String name, String value) {
        myName = name;
        myValue = value;
    }

    @Override
    public void computePresentation(@NotNull XValueNode node) {
      //Is this the same as import com.intellij.xdebugger.ui.DebuggerIcons.VALUE_ICON?
        node.setPresentation(myName, AllIcons.Debugger.Value, "java.lang.String",
                myValue != null ? StringUtil.quote(myValue) : "null", false);
    }
}
