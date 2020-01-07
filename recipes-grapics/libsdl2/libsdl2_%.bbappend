#https://git.yoctoproject.org/cgit.cgi/poky/plain/meta/recipes-graphics/libsdl2/libsdl2_2.0.10.bb

PACKAGECONFIG_append_libsdl2 = " alsa directfb gles2 kmsdrm opengl pulseaudio jack"
PACKAGECONFIG_remove_libsdl2 = " wayland x11 tslib"