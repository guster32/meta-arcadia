SUMMARY = "MameDev Arcade emulator"
HOMEPAGE = "https://www.mamedev.org/"
SECTION = "emulators"
LICENSE = "GPL-2.0"

LIC_FILES_CHKSUM = "file://COPYING;md5=222e4e1f9eaa57231d077ef8099f5b83"

DEPENDS += " virtual/egl virtual/libgles2 virtual/libgles3 virtual/libgbm libsdl2 libsdl2-image libsdl2-ttf alsa-lib fontconfig pulseaudio"

PACKAGECONFIG[gles3] = "virtual/libgles3"

inherit autotools pkgconfig

#EXTRA_OEMAKE = "NO_X11=1 "

SRC_URI += "git://git@github.com/mamedev/mame.git;protocol=ssh;nobranch=1;branch=mame0262"
SRCREV = "d48a61f9210eb22ac54840995ea922a2daae7b09"
S = "${WORKDIR}/git"

do_compile() {
    oe_runmake -C ${S}
}

do_install() {
    oe_runmake -C ${S} install DESTDIR=${D}
}