package gysspring.guoyansi.springframework.context;

import gysspring.guoyansi.springframework.core.io.GysResourceLoader;

public interface GysResourceLoaderAware {

    void setResourceLoader(GysResourceLoader resourceLoader);
}
