// 
// Decompiled by Procyon v0.6.0
// 

module kotlin.stdlib.jdk8 {
    requires java.base mandated;
    requires transitive kotlin.stdlib;
    requires kotlin.stdlib.jdk7;
    
    exports kotlin.jvm.optionals;
    exports kotlin.jvm.jdk8;
    exports kotlin.collections.jdk8;
    exports kotlin.streams.jdk8;
    exports kotlin.text.jdk8;
    exports kotlin.time.jdk8;
    
    opens kotlin.internal.jdk8 to kotlin.stdlib;
    
}
