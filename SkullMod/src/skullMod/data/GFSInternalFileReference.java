package skullMod.data;

/**
 * A reference of a file inside another file
 */
public class GFSInternalFileReference {
    public final String path;
    public final String name;
    public final int length;
    public final int offset;
    public final String originalFileName;
    public final int alignment;

    public GFSInternalFileReference(int length, int offset, int alignment){ this(null,null,length,offset,null,alignment); }
    public GFSInternalFileReference(String name, int length, int offset, int alignment){ this(null,name,length,offset,null,alignment); }
    public GFSInternalFileReference(String name, int length, int offset, String originalFileName, int alignment){ this(null,name,length,offset,originalFileName,alignment); }

    public GFSInternalFileReference(String path, String name, int length, int offset, String originalFileName,int alignment){
        if(length < 0){ throw new IllegalArgumentException("length is smaller than 0!"); }
        if(offset < 0){ throw new IllegalArgumentException("offset is smaller than 0!"); }
        this.path = path.replaceAll("/","\\")+ "\\";
        this.name = name;
        this.length = length;
        this.offset = offset;
        this.originalFileName = originalFileName;
        this.alignment = alignment;
    }
}