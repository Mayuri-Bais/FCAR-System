package com.college.fcar.report.doc;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DocGen {

    List<StreamWriter> componetnts;

    public String document(List<StreamWriter> components) {
        this.componetnts = components;
        //write ensemble
        writeEnsemble();
        // write header
        writeHeader();
        // append each component's content
        for (StreamWriter component : components) {
            component.fetchContent();
            component.appendContent();
        }
        // write footer
        writeFooter();
        // document complete?
        return "Not yet Implemented";
    }

    private  void writeEnsemble() {

    }

    private void writeHeader() {

    }

    private void writeFooter() {

    }
}
