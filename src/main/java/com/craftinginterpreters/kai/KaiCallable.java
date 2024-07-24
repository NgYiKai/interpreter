package com.craftinginterpreters.kai;

import java.util.List;

interface KaiCallable {
    Object call(Interpreter interpreter, List<Object> arguments);
    int arity();
}
