package com.bbs.test;

import com.bbs.PigLatin;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PigLatinTest {

    public static void main(String[] args) {
        Logger.getLogger("PigLatinTest").log(Level.INFO, PigLatin.pigIt("Pig latin is cool"));
    }
}
