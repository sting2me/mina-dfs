package com.sting2me.common.util;

/**
 * Created by peter on 14-12-14.
 */
public class CommandResult {
    int result;
    String output;

    public CommandResult(int r, String o) {
        this.result = r;
        this.output = o;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
