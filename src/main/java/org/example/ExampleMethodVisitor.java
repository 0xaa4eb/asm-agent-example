package org.example;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class ExampleMethodVisitor extends MethodVisitor {

    private String methodName;
    private String className;

    ExampleMethodVisitor(MethodVisitor mv, String methodName, String className) {
        super(Opcodes.ASM5, mv);
        this.methodName = methodName;
        this.className = className;
    }

    @Override
    public void visitCode() {
        super.visitCode();
    }

    @Override
    public void visitInsn(int opcode) {
        super.visitInsn(opcode);
    }
}
