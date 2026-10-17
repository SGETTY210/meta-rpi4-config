SUMMARY = "Static IP for eth0 via systemd-networkd"
DESCRIPTION = "Recipe for configuration of static board IP address"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://20-eth0-static.network"

S = "${UNPACKDIR}"

inherit allarch

do_install() {
    install -d ${D}${sysconfdir}/systemd/network
    install -m 0644 ${S}/20-eth0-static.network ${D}${sysconfdir}/systemd/network/20-eth0-static.network
}

FILES:${PN} = "${sysconfdir}/systemd/network/20-eth0-static.network"
