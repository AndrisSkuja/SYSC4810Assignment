public class Permissions {

    private boolean read;
    private boolean write;
    private boolean execute;

    public Permissions() {
        read = false;
        write = false;
        execute = false;
    }

    public Permissions(boolean r, boolean w, boolean x){
        read = r;
        write = w;
        execute = x;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public boolean isWrite() {
        return write;
    }

    public void setWrite(boolean write) {
        this.write = write;
    }

    public boolean isExecute() {
        return execute;
    }

    public void setExecute(boolean execute) {
        this.execute = execute;
    }

    @Override
    public String toString(){
        String val = "";
        if(read){
            val += "1";
        }
        else{
            val +="0";
        }
        if(write){
            val += "1";
        }
        else{
            val +="0";
        }
        if(execute){
            val += "1";
        }
        else{
            val +="0";
        }
        return val;
    }
}
