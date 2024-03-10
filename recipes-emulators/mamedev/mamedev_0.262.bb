SUMMARY = "MameDev Arcade emulator"
HOMEPAGE = "https://www.mamedev.org/"
SECTION = "emulators"
LICENSE = "GPL-2.0"

LIC_FILES_CHKSUM = "file://COPYING;md5=222e4e1f9eaa57231d077ef8099f5b83"

DEPENDS += " virtual/egl virtual/libgles2 virtual/libgles3 virtual/libgbm libsdl2 libsdl2-image libsdl2-ttf alsa-lib fontconfig pulseaudio "

#Only needed when building for x11 ?
#DEPENDS += " libxinerama qtbase qtbase-native  "

PACKAGECONFIG[gles3] = "virtual/libgles3"

inherit autotools pkgconfig

DEBUG_PREFIX_MAP:remove = "-fcanon-prefix-map"

export OVERRIDE_CC = "${CC}"
export OVERRIDE_CXX = "${CXX}"
export OVERRIDE_LD = "${LD}"
export OVERRIDE_AR = "${AR}"
#export SDL_INI_PATH = "${datadir}/konami/ini"

#This is how we would build wayland support only
EXTRA_OEMAKE += " OPTIMIZE=3 CROSS_BUILD=1 USE_WAYLAND=1 NO_X11=1 NO_USE_XINPUT=1 SUBTARGET=konami SOURCES=src/mame/konami "

#This how you would build x11
#EXTRA_OEMAKE += " CROSS_BUILD=1 SUBTARGET=konami SOURCES=src/mame/konami "

SRC_URI += "git://git@github.com/mamedev/mame.git;protocol=ssh;nobranch=1;branch=mame0262"
SRCREV = "d48a61f9210eb22ac54840995ea922a2daae7b09"
S = "${WORKDIR}/git"

do_compile() {
    bbnote TOOLCHAIN: "${STAGING_BINDIR_TOOLCHAIN}"
    bbnote CFLAGS: "${CFLAGS}"
    bbnote CXXFLAGS: "${CXXFLAGS}"
    bbnote LDFLAGS: "${LDFLAGS}"
    bbnote OVERRIDE_AR: "${AR}"
    bbnote OVERRIDE_CC: "${CC}"
    bbnote OVERRIDE_CXX: "${CXX}"
    bbnote OVERRIDE_LD: "${LD}"
    oe_runmake -C ${S}
}

do_install() {
    install -d ${D}${bindir}
    install -d ${D}${datadir}/konami/roms
    cp -rp ${S}/roms/dir.txt ${D}${datadir}/konami/roms/dir.txt
    install -m 0755 ${S}/konami ${D}${bindir}
}

FILES:${PN} += "${datadir}/konami/roms/dir.txt"
