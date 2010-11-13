package springsprout.modules.notice.support;

import java.util.List;

import springsprout.domain.Notice;

public class NoticeContainer {
    private List<Notice> list;
    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Notice> getList() {
        return list;
        
    }

    public void setList(List<Notice> list) {
        this.list = list;
    }
}
