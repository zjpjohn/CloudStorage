package cn.im47.cloud.storage.common.entity.file;

import cn.im47.cloud.storage.common.entity.IdEntity;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

/**
 * 文件存储节点
 * <p/>
 * User: baitao.jibt@gmail.com
 * Date: 12-7-11
 * Time: 上午10:56
 */
public class Node extends IdEntity implements Serializable {

    private static final long serialVersionUID = -38331060124340966L;

    private String name;                 // 结点名称
    private FileTypeEnum type;           // 结点类型
    private Node leftSibling;          // 左兄弟编号

    private Node parent;              // 父节点编号
    private List<Node> nodeList = Lists.newArrayList();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FileTypeEnum getType() {
        return type;
    }

    public void setType(FileTypeEnum type) {
        this.type = type;
    }

    public Node getLeftSibling() {
        return leftSibling;
    }

    public void setLeftSibling(Node leftSibling) {
        this.leftSibling = leftSibling;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public List<Node> getList() {
        return nodeList;
    }

    public void setNodeList(List<Node> nodeList) {
        this.nodeList = nodeList;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}