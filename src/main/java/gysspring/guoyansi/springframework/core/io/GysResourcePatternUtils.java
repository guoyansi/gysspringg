package gysspring.guoyansi.springframework.core.io;

import org.springframework.lang.Nullable;

public abstract class GysResourcePatternUtils {

    public static GysResourcePatternResolver getResourcePatternResolver(@Nullable GysResourceLoader resourceLoader){
        if (resourceLoader instanceof GysResourcePatternResolver) {
            return (GysResourcePatternResolver) resourceLoader;
        }
        throw new RuntimeException("这里需要待完善");
    }
}
