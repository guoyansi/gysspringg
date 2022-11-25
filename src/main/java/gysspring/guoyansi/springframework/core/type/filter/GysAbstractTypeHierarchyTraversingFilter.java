package gysspring.guoyansi.springframework.core.type.filter;

//抽象类型层次横穿过滤
public abstract class GysAbstractTypeHierarchyTraversingFilter implements GysTypeFilter {

    private final boolean considerInherited;
    private final boolean considerInterfaces;

    public GysAbstractTypeHierarchyTraversingFilter(boolean considerInherited,boolean considerInterfaces) {
        this.considerInherited=considerInherited;
        this.considerInterfaces=considerInterfaces;
    }

    @Override
    public boolean match() {
        return false;
    }
}
