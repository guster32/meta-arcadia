
FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
       file://rt2870.bin "

do_install:append() {
       install -d ${D}${nonarch_base_libdir}/firmware/
       install -m 0644 ${WORKDIR}/rt2870.bin ${D}${nonarch_base_libdir}/firmware/
}

PACKAGES:prepend = "\
    ${PN}-rt2870 \
"
FILES:${PN}-rt2870 = " ${nonarch_base_libdir}/firmware/rt2870.bin "

LICENSE:${PN}-rt2870 = "Firmware-ralink-firmware"

RDEPENDS:${PN}-rt2870 += "${PN}-ralink-license"

