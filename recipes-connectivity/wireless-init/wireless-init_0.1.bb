DESCRIPTION = "Systemd service to initialize a wireless network interface"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PR = "r0"

SRC_URI = "file://network-wireless@.service"

S = "${WORKDIR}"

inherit systemd

SYSTEMD_SERVICE:${PN} = "network-wireless@.service"
SYSTEMD_AUTO_ENABLE = "disable"

RDEPENDS_${PN} = "wpa-supplicant iproute2"

do_install() {
    install -d ${D}/${systemd_system_unitdir}
    install -m 0644 ${S}/network-wireless@.service ${D}${systemd_system_unitdir}
}

FILES_${PN} += "${systemd_system_unitdir}/*"
