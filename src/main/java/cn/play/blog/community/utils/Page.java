package cn.play.blog.community.utils;


/**
 * 分页信息
 */
public class Page {

    //当前页
    private int current = 1;
    //显示上限/每页展示条数
    private int limit = 10;
    //数据总数
    private int rows;
    //查询路径(多人访问同一页时复用分页链接) ???
    private String path;

    //------  自动计算 ---------
    //起始页码
    private int from;
    //结束页码
    private int to;
    //总页码
    private int totalPage;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if (current > 1) {
            this.current = current;
        }
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if (limit > 1 && limit < 101) {
            this.limit = limit;
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if (rows > 0) {
            this.rows = rows;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getOffset() {
        return (current - 1) * limit + 1;
    }

    public int getTotalPage() {
        if (rows % limit == 0) {
            return rows / limit;
        } else {
            return rows / limit + 1;
        }
    }

    /**
     * 起始页码
     *
     * @return
     */
    public int getFrom() {
        int from = current - 2;
        return from > 0 ? from : 1;
    }

    /**
     * 结束页码
     *
     * @return
     */
    public int getTo() {
        int first = current - 2;
        int i = (first > 0) ? (first + 4) : 5;

        int total;
        if (rows % limit == 0) {
            total = rows / limit;
        } else {
            total = rows / limit + 1;
        }
        return total > i ? i : total;
    }

    @Override
    public String toString() {
        return "Page{" +
                "current=" + current +
                ", limit=" + limit +
                ", rows=" + rows +
                ", path='" + path + '\'' +
                ", from=" + this.getFrom() +
                ", to=" + this.getTo() +
                ", totalPage=" + this.getTotalPage() +
                '}';
    }
}
