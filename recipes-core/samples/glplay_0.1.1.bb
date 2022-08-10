SUMMARY = "GLPlay"
SECTION = "Sample"
LICENSE = "MIT"
HOMEPAGE = "https://github.com/guster32/glplay"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84f20c3b625ccbba2d4fb9c7ba68e9f1"
DEPENDS += "mesa libdrm virtual/egl virtual/libgles2 virtual/libgbm"

SRC_URI += "git://git@github.com/guster32/glplay.git;protocol=ssh;nobranch=1;branch=main"
SRCREV = "9d4e6c64d021ba462613a2a2386c494b5dd27877"
S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = " -DCMAKE_BUILD_TYPE=Debug "