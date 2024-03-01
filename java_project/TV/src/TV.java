class TV{
    private int current_channel;
    private int current_volume;
    private boolean on;

    TV(){
        current_channel =1;
        current_volume =1;
        on = false;
    }
    @Override
    public String toString(){if(on)return "chanal: "+current_channel + "\nvolume: "
            + current_volume;else return "TV is OFF";}


    void turn_on(){on = true;}
    void turn_off(){on = false;}

    void set_new_chanal(int newChanal){
        if(on && current_channel>=1 && current_channel<=120){
            current_channel = newChanal;
        }
    }

    void set_new_volume(int newVolume){
        if(on && current_volume>=1 && current_volume<=7){
            current_volume = newVolume;
        }
    }

    void Increases_the_channel_number(){
        if(on && current_channel<120){
            current_channel++;

        }
    }

    void Decreases_the_channel_number(){
        if(on && current_channel>1){
            current_channel--;

        }
    }

    void Increases_the_volume_number(){
        if(on && current_volume<7){
            current_volume++;

        }

    }

    void Decreases_the_volume_number(){
        if(on && current_volume>1){
            current_volume--;

        }
    }
}